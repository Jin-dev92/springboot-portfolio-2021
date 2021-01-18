import axios from 'axios';

class ApiService{
    //Create
    insertData(URL,data){
        console.log("apiService.js + insertData");
        return axios.post(URL,data);
    }
    //Read
    fetchData(URL){
        console.log("apiService.js + fetchData");
        return axios.get(URL);
    }
    //Update
    updateData(URL,data){
        console.log("apiService.js + updateData");
        return axios.put(URL,data);
    }
    //Delete
    deleteData(URL){
        console.log("apiService.js + deleteData");   
        return axios.delete(URL);
    }
    
}

export default new ApiService();