import React from 'react';
import NavigationBar from "./NavigationBar";
import {goToHomePage} from "../../functions/navigation";
import {useNavigate} from "react-router-dom";

// TODO - Task 1: Please name me

function Header() {
    const navigate = useNavigate();
    return (
        <div className="page-header">
            <h1 onClick={() => goToHomePage(navigate)}>
                <span className='hackstreet-header'>Hackstreet </span> 
                <span className='boys-header'>Boys</span>
            </h1>
            <NavigationBar/>
        </div>
    );
}

export default Header;