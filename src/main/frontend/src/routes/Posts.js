import react from 'react';
import axios from 'axios';
import {useForm} from 'react-hook-form'

function Posts() {
    const {register, handleSubmit, errors} = useForm();
    const onSubmit =  (data) => {
        axios({
            method : "POST",
            url : "/api/posts",
            data : data
        }).then((res) =>{
            console.log(res);
        }).catch((error) =>{
            throw new Error(error);
        });
        window.location.href='/#/admin';
    };

    return (
        <div className="posts container">
            <form className="form__posts" onSubmit={handleSubmit(onSubmit)}>
                <div><span>제목</span><input className="form__title" name="title" ref={register({required:true})}></input><span>{errors.title && "제목은 써야지 아 ㅋㅋ"}</span></div>
                <div><span>내용</span><textarea className="form__contents" name="contents" ref={register({maxLength:200})}></textarea>{errors.contents && "Your input required to be less than 200"}</div>
                <div><span>글쓴이</span><textarea className="form__author" name="author" ref={register({required:true})}></textarea><span>{errors.author && "이름이 뭐니?"}</span></div>
                
                <div className="form_button">
                    <button className="btn__cancel">취소</button>
                    <button className="btn__submit">제출</button>
                </div>
            </form>
        </div>
    );
}

export default Posts;