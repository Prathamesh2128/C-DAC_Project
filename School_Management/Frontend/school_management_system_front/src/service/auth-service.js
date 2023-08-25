import axios from "axios";

const API_URL = "http://localhost:8080/user";

class AuthService {
    loginUser(userName, password) {
        return axios
        .post(API_URL + "/signin", 
        {
            userName,
            password
        })
            .then(response => {
                if (response.data.jwt) {
                    localStorage.setItem('user', JSON.stringify(response.data));        //user: key JSON.stringify(response.data):data ==> In string format
                }
                return response.data;
            });
    }

    logout() {
        localStorage.removeItem('user');        //Remove local storage 
    }

    getCurrentUser() {
        return JSON.parse(localStorage.getItem('user'));        //get info about user from local storage in json format
    }
}

export default new AuthService();