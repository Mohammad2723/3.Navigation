package ebrahimi16153.github.com.a3navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import ebrahimi16153.github.com.a3navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // binding
    private lateinit var binding: ActivityMainBinding

    //navController
    private lateinit var navController: NavController

    // ActionBar name
    private lateinit var appBarConfiguration: AppBarConfiguration

    //onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navController = findNavController(R.id.navHost)
            appBarConfiguration =
                AppBarConfiguration(setOf(R.id.homeFragment, R.id.detailsFragment))
            setupActionBarWithNavController(navController, appBarConfiguration)
        }

    }

    override fun onNavigateUp(): Boolean {
        return navController.navigateUp() || super.onNavigateUp()
    }
}