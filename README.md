# Overview

Currently this is the first app I have created and it is a simple to do list.
Upon opening the app you will see three things, a line where you can enter items, an Add button and a Delete button. To use the app simply type an item to add to your to-do list, and then click add to submit that item to the list. Once you have some items or an item in your list you can then check them off, and click the delete button to remove them from the list. 

This is the first app I have created using Kotlin and Android Studio. The purpose was to get familiar with the Kotlin language and the Android Studio IDE. 

[Software Demo Video](https://youtu.be/edoUHi9HiwM)

# Development Environment

I used Android Studio to develop the app, and I used the AVD manager to run a virtual phone so that I could test the app. 

I used the Kotlin language to develop the app. Here are all of the imports I used while making the app. 
import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

# Useful Websites

* [W3Schools.com](https://www.w3schools.com/)
* [Android.com](https://developer.android.com/training/basics/firstapp)

# Future Work

* Connect the app to a database so that your list can be saved on your phone, it won't be removed when you close your phone or the app
* Add more scheduling help pages like a calendar where you can set appointments and mark down times for things
* Add a delete all option
