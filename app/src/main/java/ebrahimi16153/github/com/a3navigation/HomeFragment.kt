package ebrahimi16153.github.com.a3navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ebrahimi16153.github.com.a3navigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    //binding
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
       binding = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSend.setOnClickListener {
                //go to detailsFragment
                //findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)


                //go to detailsFragment with some data
                val directions = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(ethData.text.toString())
                findNavController().navigate(directions)

            }
        }

    }

}