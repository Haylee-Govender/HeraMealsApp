
Report: Time-Based Food Recommendation App 

1. Introduction
   
This report outlines the development of a Kotlin-based mobile application designed to provide users with food recommendations tailored to the time of day.
The app aims to simplify meal planning by offering relevant and timely suggestions, enhancing the user's dining experience. This document will detail the app's purpose,
design considerations, and the implementation of GitHub and GitHub Actions for version control and continuous integration/continuous deployment (CI/CD).

3. Purpose and Goals
   
2.1 Simplify Meal Decisions: The primary goal is to alleviate the decision fatigue associated with meal planning by providing contextually relevant food options.
2.2 User-Friendly Interface: A clean and intuitive user interface ensures easy navigation and a pleasant user experience.
2.3 Time-Based Relevance: The app leverages the device's time to suggest meals appropriate for breakfast, lunch, dinner, and snacks. 
2.4 Learning Kotlin/Android Development: To improve kotlin and android app development skills.
2.5 Implementing CI/CD: To gain experience in implementing Github actions for continuous integration and continious deployment.

4. Design Considerations
   
3.1 Clean and Minimalist: A simple and uncluttered UI promotes ease of use.
3.2 Easy Navigation:The app consists of two EditText fields (time input and food display) and a button to trigger the recommendation.
3.3 Visual Appeal: High-quality images or icons are used to enhance the visual appeal of food recommendations.
3.4 Time-Based Sections: The app is organized into distinct sections for breakfast, lunch, dinner, and snacks, each displaying relevant food options.
3.5 User-friendly design
3.6 Text-Based Output: Food recommendations are displayed as plain text.
3.7 Event Handling: The app uses an OnClickListener to handle the button's click event.

4.Implementation Details

4.1 UI:

- Two EditText elements in the layout: one for time input and one for displaying food.
- A Button to trigger the food recommendation logic.

4.2 Logic: 

- retrieves the time string from the input EditText when the button is clicked.
- Parses the time string and performs basic comparisons to determine the time category (e.g., breakfast, lunch, dinner).
- Displays a random meal from the list based on time entered.
- Displays a plain text.
- Button clicked again will output another meal for that specific time.

4.3 Button Activation:

- An OnClickListener is attached to the button.
- The Logic that retrieves, parses, and displays the food is contained within the onClick function of the listener.

4.4 Data:

- Food data is currently stored as String in a list under a variable within the Kotlin code

5. GitHub and GitHub Actions Utilization
   
5.1GitHub Repository:

- A GitHub repository is used to store the app's source code, enabling version control and collaboration.
- Even for a simple app, git allows for tracking changes, and a safe place to store the code.

5.2 GitHub Actions 

While not currently implemented, GitHub Actions can be used for:
- Automated unit tests (even simple tests to ensure button functionality and basic logic works).
- Automated linting to enforce code style.
- Automated deployment to a testing environment or Firebase App Distribution for testing.
- As the app grows, the importance of CI/CD grows.
  
6. Future Enhancements (Building on the Foundation)

6.1 Improved UI: Transition from EditText to a more user-friendly UI with buttons, lists, and visual elements.
6.2 Replace EditText with Time Picker: Implement a TimePicker for user-friendly time input, reducing errors and improving UX.
6.3 Expandable Food Database: Allow users to add or modify food recommendations.
6.4 Visual Food Representation: Display food recommendations with images. 
6.5 Button Feedback: Add visual feedback to the button, such as a ripple effect or a momentary color change, to indicate a successful tap.

7. Conclusion

This simplified food recommendation app, activated by a button press, serves as a valuable learning experience in basic Kotlin and Android development.
While currently displaying food recommendations in an EditText based on user-inputted time, it provides a solid foundation for future enhancements.
Utilizing GitHub for version control ensures code maintainability, and the potential for GitHub Actions offers opportunities to automate testing and deployment as the app evolves.
Even a simple application benefits from version control, and by setting up the repository correctly from the beginning, scaling the application becomes easier.

Code for first page 
package vcmsa.haylee.heramealsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Open MealsPage when BtnStart is clicked
        val BtnStart = findViewById<Button>(R.id.BtnStart)
        BtnStart.setOnClickListener {
            val intent = Intent(this, MealsPage::class.java)
            startActivity(intent)
        }


    }
}

Code for second page
package vcmsa.haylee.heramealsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText

class MealsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_meals_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Initialize variables
        val BtnSuggest = findViewById<Button>(R.id.BtnSuggest)
        val BtnReset = findViewById<Button>(R.id.BtnReset)
        val EdtTime = findViewById<EditText>(R.id.EdtTime)
        val EdtMeal = findViewById<EditText>(R.id.EdtMeal)
        // Initialize meal lists
        val morningMeals = listOf("Oatmeal", "Greek Yogurt", "Smoothie", "Eggs", "Toast","Pancakes", "Waffles", "Croissants", "Avocado Toast","cereal")
        val midMorningMeals = listOf("Fruit Salad", "Protein Bar", "Yogurt with Berries", "Cheese and Crackers", "Hummus with Veggies","Rice Cakes with Peanut Butter", "Granola Bar", "Protein Shake", "Cheese and Fruit","Smoothie Bowl")
        val afternoonMeals = listOf("Grilled Cheese Sandwich", "Chicken Salad Sandwich", "Turkey Sandwich", "Vegetable Soup", "Smoothie","Salad", "Sandwich", "Soup", "Rice Bowl", "Fruit Bowl")
        val midAfternoonMeals = listOf("Fruit Salad", "Protein Bar", "Yogurt with Berries", "Cheese and Crackers", "Hummus with Veggies","Rice Cakes with Peanut Butter", "Granola Bar", "Protein Shake", "Cheese and Fruit","Smoothie Bowl")
        val dinnerMeals = listOf("Chicken Parmesan", "Salmon with Vegetables", "Beef Stir Fry", "Vegetable Curry", "Pasta with Meatballs","Pizza", "Burger", "Sushi", "Tacos", "Steak")
        val afterDinnerMeals = listOf("Fruit Salad", "Protein Bar", "Yogurt with Berries", "Cheese and Crackers", "Hummus with Veggies","Rice Cakes with Peanut Butter", "Granola Bar", "Protein Shake", "Cheese and Fruit","Smoothie Bowl")

       // Suggest meal button click listener
       BtnSuggest.setOnClickListener {
           // Check if time is entered
           if (EdtTime.text.toString().isEmpty()) {
               EdtMeal.setText("Please enter the time of day")
               EdtTime.requestFocus()

           }
           // Get the time entered by the user
           val time = EdtTime.text.toString()
           // Suggest a meal based on the time entered by the user
           if (time == "Morning") {
               // Suggest a random meal from the morningMeals list
               val meal = morningMeals.random()
               EdtMeal.setText(meal)
           } else if (time == "MidM") {
               // Suggest a random meal from the midMorningMeals list
               val meal = midMorningMeals.random()
               EdtMeal.setText(meal)
               } else if (time == "Afternoon") {
                   // Suggest a random meal from the afternoonMeals list
               val meal = afternoonMeals.random()
               EdtMeal.setText(meal)
           } else if (time == "MidA") {
               // Suggest a random meal from the midAfternoonMeals list
               val meal = midAfternoonMeals.random()
               EdtMeal.setText(meal)
           } else if (time == "Dinner") {
               // Suggest a random meal from the dinnerMeals list
               val meal = dinnerMeals.random()
               EdtMeal.setText(meal)
           } else if (time == "AfterD") {
               // Suggest a random meal from the afterDinnerMeals list
               val meal = afterDinnerMeals.random()
               EdtMeal.setText(meal)
           } else {
               // Display an error message if the time entered is invalid
               EdtMeal.setText("Invalid time")
               EdtTime.setText("")
               EdtTime.requestFocus()


           }
           // Reset button click listener
          BtnReset.setOnClickListener {
              // Clear the time and meal fields
              EdtTime.setText("")
              EdtMeal.setText("")
              EdtTime.requestFocus()

          }

       }


    }
}  

PICS OF APP 
![firstpage](https://github.com/user-attachments/assets/87e8932e-57e4-4c01-b14d-eb74a53b987d)
![secondpage](https://github.com/user-attachments/assets/01ceb0be-3730-405e-8e22-a41e17b94ae7)


 
