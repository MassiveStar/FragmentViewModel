package com.example.fragmentviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _name = MutableLiveData<String>()

    init {
        _name.value = ""
    }

    val name: LiveData<String>
        get() = _name

    fun setNameData(nameData: String){
        _name.value = nameData
    }

    override fun onCleared() {
        super.onCleared()
    }
}