package com.duanpham.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    lateinit var inboxFragment: InboxFragment
    lateinit var snoozedFragment: SnoozedFragment
    lateinit var doneFragment: DoneFragment
    lateinit var draftFragment: DraftFragment
    lateinit var sentFragment: SentFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        // for displaying an drawer indicator in the appbar
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

        // The default fragment is inbox
//        inboxFragment = InboxFragment()
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.frame_container, inboxFragment)
//            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//            .commit()

        // set up adapter
        val fragmentAdapter = PagerAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add -> {
                Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.add_sensor -> {
                Toast.makeText(this, "Add sensor clicked", Toast.LENGTH_SHORT).show()
                val dialogView = LayoutInflater.from(this).inflate(R.layout.add_sensor, null)
                val builder = AlertDialog.Builder(this)
                builder.setView(dialogView).show()
            }
            R.id.add_fan -> {
                Toast.makeText(this, "Add fan clicked", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.inbox -> {
                Toast.makeText(this, "Inbox clicked", Toast.LENGTH_SHORT).show()
//                inboxFragment = InboxFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame_container, inboxFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
            }
            R.id.snooze -> {
                Toast.makeText(this, "Snoozed clicked", Toast.LENGTH_SHORT).show()
//                snoozedFragment = SnoozedFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame_container, snoozedFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
            }
            R.id.done -> {
                Toast.makeText(this, "Done clicked", Toast.LENGTH_SHORT).show()
//                doneFragment = DoneFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame_container, doneFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
            }
            R.id.draft -> {
                Toast.makeText(this, "Draft clicked", Toast.LENGTH_SHORT).show()
//                draftFragment = DraftFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame_container, draftFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
            }
            R.id.sent -> {
                Toast.makeText(this, "Sent clicked", Toast.LENGTH_SHORT).show()
//                sentFragment = SentFragment()
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.frame_container, sentFragment)
//                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                    .commit()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}