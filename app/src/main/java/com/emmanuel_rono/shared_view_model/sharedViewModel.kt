package com.emmanuel_rono.shared_view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class sharedViewModel:ViewModel()
{
    //create a variable to store the data
    private var name=MutableLiveData("Emamnuel")
            //Expose a variable to get the data and assign the data to the stroing variable
    val Name:LiveData<String> = name
    //create a  function to get the value and  save it
    fun newName(newnames:String)
    {
       name.value=newnames
    }
}
//MutableData is changeable,
//Name got data similar to the name vaiable
//newNam