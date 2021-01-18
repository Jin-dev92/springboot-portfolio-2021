import react from 'react';
// import './Kokoa.css'
function Kokoa() {
    const {friend} = [
        {
            name : '김의진',
            thumbnail : '',
            subtitle : '',
            music : '',
        },
        {
            name : '고등어',
            thumbnail : '',
            subtitle : '',
            music : '',
        },
        {
            name : '하인즈',
            thumbnail : '',
            subtitle : '',
            music : '',
        },
        {
            name : '다람쥐',
            thumbnail : '',
            subtitle : '',
            music : '',
        },
        {
            name : '라면',
            thumbnail : '',
            subtitle : '',
            music : '',
        },
        {
            name : '소',
            thumbnail : '',
            subtitle : '2021년은 소의 해입니다.',
            music : '',
        },
    ]
    return (
        <div className="container">
            <div className="kokoa">
                <div className="headerNav_icon">
                    <div className="headerNav_wrapper">
                        <div className="headerNav_title"><p>친구</p></div>
                        <div className="headerNav_button">
                            <ul>
                                <li><img src="/images/icons/magnifier.png" alt=""></img></li>
                                <li><img src="/images/icons/user.png" alt=""></img></li>
                                <li><img src="/images/icons/headphones.png" alt=""></img></li>
                                <li><img src="/images/icons/gear.png" alt=""></img></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div className="people">
                    <div className="people__wrapper">
                        <div className="people__thumbnail"><img src="/images/tanus_cat.gif" alt=""></img></div>
                        <div className="people__info"><p>김의진</p><p>빼빼로는 사서 드세요 제발..</p></div>
                        <div className="people__music"><p>이적 - 다행이다.</p></div>
                    </div>
                </div>
                <div className="people">
                    <div className="people__wrapper">
                        <div className="people__thumbnail"><img src="/images/tanus_cat.gif" alt=""></img></div>
                        <div className="people__info"><p>김의진</p><p>빼빼로는 사서 드세요 제발..</p></div>
                        <div className="people__music"><p>이적 - 다행이다.</p></div>
                    </div>
                </div>
                <div className="people">
                    <div className="people__wrapper">
                        <div className="people__thumbnail"><img src="/images/tanus_cat.gif" alt=""></img></div>
                        <div className="people__info"><p>김의진</p><p>빼빼로는 사서 드세요 제발..</p></div>
                        <div className="people__music"><p>이적 - 다행이다.</p></div>
                    </div>
                </div>
                <div className="footerNav_icon">

                </div>
            </div>
            <div className="temp__screen">큰 화면에서는 볼 수 없습니당 ㅠ</div>
        </div>

    );
}

export default Kokoa;