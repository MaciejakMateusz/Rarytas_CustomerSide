export function fetchOrderByTableNumber(id) {
    return fetch(`http://localhost:8082/api/orders/${id}`)
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error("Communication error: GET /api/orders");
            }
        }).then(data => {
            return data;
        }).catch(function (error) {
            console.log(error);
        });
}

export function fetchOrderById(id) {
    return fetch(`http://localhost:8082/api/orders/id/${id}`)
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error("Communication error: GET /api/orders/id");
            }
        }).then(data => {
            return data;
        }).catch(error => {
            console.log(error);
        });
}

export function fetchEntireMenu() {
    return fetch(`http://localhost:8082/api/categories`)
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error("Communication error: GET /api/categories")
            }
        }).then(data => {
            return data;
        }).catch(error => {
            console.log(error)
        });
}