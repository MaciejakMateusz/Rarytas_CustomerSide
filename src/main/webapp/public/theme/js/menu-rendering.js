import {fetchEntireMenu} from "./fetchFunctions.js";

fetchEntireMenu().then(orders => {
    console.log(orders);
    orders.forEach(order => {
        console.log(order);
    });
});