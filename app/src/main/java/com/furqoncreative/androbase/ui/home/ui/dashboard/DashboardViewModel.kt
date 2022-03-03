package com.furqoncreative.androbase.ui.home.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.furqoncreative.androbase.data.Affirmation
import com.furqoncreative.androbase.data.DataSource

class DashboardViewModel : ViewModel() {

    private val _data = MutableLiveData<List<Affirmation>>().apply {
        value = DataSource().loadAffirmation()
    }
    val text: LiveData<List<Affirmation>> = _data
}