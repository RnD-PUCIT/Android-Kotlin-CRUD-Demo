package pk.edu.pucit.androidkotlincrudclient

import retrofit2.http.GET

interface ApiService {
    @GET("sdb/allStudents")
    suspend fun getAllStudents(): List<Student>
}