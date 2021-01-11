import react from 'react';
import { HashRouter, Link, Route } from 'react-router-dom';

function Navigation(params) {
    return (
        <header>
            <ul className="menu_list">
                <li>
                    <Link to="/">Home</Link>
                </li>
                <li>
                    <Link to="/Admin">Admin</Link>
                </li>
                <li>
                    <Link to="/">게시판1</Link>
                </li>
            </ul>
        </header>
    );
}

export default Navigation;