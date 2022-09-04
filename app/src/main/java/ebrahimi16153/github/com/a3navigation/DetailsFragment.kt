package ebrahimi16153.github.com.a3navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import ebrahimi16153.github.com.a3navigation.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {
    //binding
    private lateinit var binding: FragmentDetailsBinding

    //args
    private val args: DetailsFragmentArgs by navArgs()
    private var data = ""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            FragmentDetailsBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            data = args.bundelInfo
            textViewData.text = data

        }
    }
}