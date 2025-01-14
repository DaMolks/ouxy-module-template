package com.damolks.ouxy.modules.template.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ModuleViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<UiState>(UiState.Initial)
    val uiState: StateFlow<UiState> = _uiState
    
    sealed class UiState {
        object Initial : UiState()
        object Loading : UiState()
        data class Error(val message: String) : UiState()
        data class Success(val data: String) : UiState()
    }
    
    fun performAction() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            try {
                // Action du ViewModel
                _uiState.value = UiState.Success("Done")
            } catch (e: Exception) {
                _uiState.value = UiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}