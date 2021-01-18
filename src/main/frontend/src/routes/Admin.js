import react , {useEffect, useState} from 'react';
import TableRow from '../component/TableRow';
import { Table } from 'react-bootstrap';
import axios from 'axios';
// import '../routes/Admin.css';
function Admin() {
    const {Loading, setLoading} = useState(true);
    const {data , setData} = useState('');
    dataFetch = () =>
    axios({
        method : "GET",
        url : "/api/admin",
    }).then((res) =>{
        setData(res.data);
        setLoading(false);
    }).catch((error) =>{
        throw new Error(error);
    });

    useEffect( async () => {
        await dataFetch
        .then(res => this.setState({data : res.data , Loading : false }))
        .catch(err => console.log(err));
        
        window.location.href='/#/admin';
    });

    return (
        <section className="admin">
            <section className="contents">
                {/* <aside className="admin__container__1 container">
                    <ul>
                        <li>게시판1</li>
                        <li>게시판2</li>
                        <li>게시판3</li>
                        <li>게시판4</li>
                    </ul>
                </aside> */}
                <section>
                    <Table striped bordered hover variant="dark">
                        <thead>
                            <tr>
                                <td>#</td>
                                <td>Title</td>
                                <td>Author</td>
                                <td>Regdate</td>
                                <td>Function</td>
                            </tr>
                        </thead>
                        <tbody>
                            {Loading ? "대충 로딩중이미지.." : data ? data.map(data => (<TableRow no={data.no} title={data.title} author={data.author} regdate={data.modifiedDate}/>)) : "데이터가 없습니다.... :("}
                        </tbody>
                    </Table>
                </section>
            </section>
        </section>
    );
}

export default Admin;