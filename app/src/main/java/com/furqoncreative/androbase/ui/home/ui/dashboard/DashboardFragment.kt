package com.furqoncreative.androbase.ui.home.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.furqoncreative.androbase.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            binding.rvAffirmations.adapter = DashboardAdapter(requireContext(), it)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}