import react from 'react';
import '../routes/Admin.css';
function Admin() {
    return (
        <section className="admin">
            <section className="contents">
                <aside className="admin__container__1 container">
                    <ul>
                        <li>게시판1</li>
                        <li>게시판2</li>
                        <li>게시판3</li>
                        <li>게시판4</li>
                        {/* @todo map 을 사용하여 자동화 시켜야함 */}
                    </ul>
                </aside>
                <section className="admin__container__2 container">
                    <table>
                        <thead>
                            <tr>
                                <td>no</td>
                                <td>title</td>
                                <td>author</td>
                                <td>regdate</td>
                                <td>function</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr className="rows">
                                <td>1</td>
                                <td>글제머ㅗㄱ모고모고목</td>
                                <td>admin</td>
                                <td>2021-01-11</td>
                                <td className="rows__func"><button>수정</button><button>삭제</button></td>
                            </tr>
                        </tbody>
                    </table>
                </section>
            </section>
        </section>
    );
}

export default Admin;