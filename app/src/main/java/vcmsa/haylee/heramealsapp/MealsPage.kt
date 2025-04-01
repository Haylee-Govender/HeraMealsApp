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