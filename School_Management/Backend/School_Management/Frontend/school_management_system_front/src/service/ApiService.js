import axios from 'axios';
import authHeader from './auth-header';

const USER_API_BASE_URL = 'http://localhost:8080';

class ApiService{
    fetchHome() {
        return axios.get(USER_API_BASE_URL);
    }

    getPublicContent() {
        return axios.get(USER_API_BASE_URL + '/api/all', {headers: authHeader()})
    }
}

export default new ApiService();