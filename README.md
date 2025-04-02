
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

# HeraMealsApp - Meal Suggestion Application

This document describes the functionality and usage of the HerMealsApp, a Kotlin-based Android application that suggests meal ideas based on the time of day.

## Overview

HerMealsApp is a simple Android application designed to provide meal suggestions to users based on the time of day they input. It consists of two main screens: a starting screen and a meal suggestion screen.

## Files

* `MainActivity.kt`: Handles the initial screen and navigation to the meal suggestion screen.
* `MealsPage.kt`: Manages the meal suggestion logic and user interactions.
* `activity_main.xml`: Layout file for the main activity.
* `activity_meals_page.xml`: Layout file for the meal suggestion activity.

## Dependencies

* AndroidX AppCompat
* AndroidX Core KTX
* AndroidX Activity KTX

## Usage

### Prerequisites

* Android Studio installed.
* Android SDK configured.
* An Android emulator or physical Android device.

### Installation and Execution

1.  **Clone the Repository (if applicable):**
    * If you have the code in a repository, clone it to your local machine.
2.  **Open Project in Android Studio:**
    * Launch Android Studio.
    * Select "Open" and navigate to the project directory.
    * Open the project.
3.  **Build and Run:**
    * Connect an Android emulator or a physical Android device to your computer.
    * Click the "Run" button in Android Studio to build and run the application.

### Functionality

**MainActivity:**

* Displays a "Start" button.
* When the "Start" button is clicked, it navigates to the `MealsPage`.

**MealsPage:**

* Provides an `EditText` field (`EdtTime`) for users to enter the time of day.
* Provides an `EditText` field (`EdtMeal`) to display the suggested meal.
* Contains a "Suggest" button (`BtnSuggest`) to generate meal suggestions.
* Contains a "Reset" button (`BtnReset`) to clear input fields.
* **Suggest Button Logic:**
    * Checks if the `EdtTime` field is empty. If empty, displays an error message.
    * If the `EdtTime` field is not empty, it retrieves the entered time.
    * It then compares the entered time with predefined time slots ("Morning", "MidM", "Afternoon", "MidA", "Dinner", "AfterD").
    * Based on the time slot, it randomly selects a meal from a corresponding list of meal options.
    * Displays the selected meal in the `EdtMeal` field.
    * If the time entered is invalid, it displays "Invalid time" in the `EdtMeal` field.
* **Reset Button Logic:**
    * Clears the contents of the `EdtTime` and `EdtMeal` fields.

### Meal Lists

The application uses predefined lists for each time slot:

* `morningMeals`: Oatmeal, Greek Yogurt, Smoothie, Eggs, Toast, Pancakes, Waffles, Croissants, Avocado Toast, cereal.
* `midMorningMeals`: Fruit Salad, Protein Bar, Yogurt with Berries, Cheese and Crackers, Hummus with Veggies, Rice Cakes with Peanut Butter, Granola Bar, Protein Shake, Cheese and Fruit, Smoothie Bowl.
* `afternoonMeals`: Grilled Cheese Sandwich, Chicken Salad Sandwich, Turkey Sandwich, Vegetable Soup, Smoothie, Salad, Sandwich, Soup, Rice Bowl, Fruit Bowl.
* `midAfternoonMeals`: Fruit Salad, Protein Bar, Yogurt with Berries, Cheese and Crackers, Hummus with Veggies, Rice Cakes with Peanut Butter, Granola Bar, Protein Shake, Cheese and Fruit, Smoothie Bowl.
* `dinnerMeals`: Chicken Parmesan, Salmon with Vegetables, Beef Stir Fry, Vegetable Curry, Pasta with Meatballs, Pizza, Burger, Sushi, Tacos, Steak.
* `afterDinnerMeals`: Fruit Salad, Protein Bar, Yogurt with Berries, Cheese and Crackers, Hummus with Veggies, Rice Cakes with Peanut Butter, Granola Bar, Protein Shake, Cheese and Fruit, Smoothie Bowl.

### Notes

* The time input is case-sensitive.
* Meal suggestions are randomly selected from the predefined lists.
* Future improvements could include:
    * Adding a database for meal storage.
    * Implementing a more user-friendly interface.
    * Adding error handling for invalid input.
    * Adding more meal variety.

PICS OF APP 

![firstpage](https://github.com/user-attachments/assets/87e8932e-57e4-4c01-b14d-eb74a53b987d)

![secondpage](https://github.com/user-attachments/assets/01ceb0be-3730-405e-8e22-a41e17b94ae7)

![firstCode](https://github.com/user-attachments/assets/10ef60eb-b1c9-4528-9689-b18be424d743)

![secondcode](https://github.com/user-attachments/assets/d274b696-3d9c-4722-aaa3-74a870cd9ae0)

![secondcode2](https://github.com/user-attachments/assets/d58432ee-ab07-41b1-ad0d-acfc51b22678)

![secondcode3](https://github.com/user-attachments/assets/cf97bd15-7f5b-440f-81f1-95d8af8a6082)

![secondcode4](https://github.com/user-attachments/assets/73597fdd-c0d3-4a15-a101-df58ad4edadc)

![secondcode5](https://github.com/user-attachments/assets/4bc32b65-7368-494b-9ed9-e02aa99af448)





 
