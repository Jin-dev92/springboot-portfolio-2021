import react from 'react';


function TableRow({no,title,author,regdate}) {
    return (
        <tr className="rows">
            <td>{no}</td>
            <td>{title}</td>
            <td>{author}</td>
            <td>{regdate}</td>
            <td className="rows__func"><button className="edit_button">수정</button><button className="delete_button">삭제</button></td>
        </tr>
    );
}

export default TableRow;