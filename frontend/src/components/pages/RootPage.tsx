import { goToProductsPage } from "../../functions/navigation";
import React, { useContext, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import { fetchBasket } from "../../api/fetchBasket";
import BasketContext from "../../context/BasketContext";




function RootPage() {
  const basket = useContext(BasketContext);
  const navigate = useNavigate();

  useEffect(() => {
    fetchBasket(basket.setCurrentBasket);
  }, []);


    useEffect(() => {
        fetchBasket(basket.setCurrentBasket);
    }, []);



    return (
        <div className="app-body">
            <div onClick={() => goToProductsPage(navigate)} className="products-block">
                <label>
                    <span className='merch-header'>The best merch in town. As long as you </span> 
                    <span className='hack-header'>hack </span>
                    <span className='me-header'>me... </span>
                </label>
            </div>
        </div>
        
    );
}

export default RootPage;

