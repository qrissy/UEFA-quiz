package com.example.uefaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Global variables
    int score = 0;
    RadioButton quest1RadioBtn1, quest1RadioBtn2, quest1RadioBtn3, quest1RadioBtn4, quest2RadioBtn1,
            quest2RadioBtn2, quest2RadioBtn3,
            quest2RadioBtn4, quest5RadioBtn1, quest5RadioBtn2, quest5RadioBtn3, quest5RadioBtn4;
    CheckBox quest3ChBx1, quest3ChBx2, quest3ChBx3, quest3ChBx4, quest4ChBx1, quest4ChBx2,
            quest4ChBx3, quest4ChBx4;
    EditText userName, questionSix;
    Button button;
    private boolean isAnswered = false;
    RadioGroup radioGroup1, radioGroup2, radioGroup3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User name view
        userName = (EditText) findViewById(R.id.user_name);

        // Question one answer views
        quest1RadioBtn1 = (RadioButton) findViewById(R.id.radio_question_1a);
        quest1RadioBtn2 = (RadioButton) findViewById(R.id.radio_question_1b);
        quest1RadioBtn3 = (RadioButton) findViewById(R.id.radio_question_1c);
        quest1RadioBtn4 = (RadioButton) findViewById(R.id.radio_question_1d);

        // Question two answer views
        quest2RadioBtn1 = (RadioButton) findViewById(R.id.radio_question_2a);
        quest2RadioBtn2 = (RadioButton) findViewById(R.id.radio_question_2b);
        quest2RadioBtn3 = (RadioButton) findViewById(R.id.radio_question_2c);
        quest2RadioBtn4 = (RadioButton) findViewById(R.id.radio_question_2d);

        // Question three answer views
        quest3ChBx1 = (CheckBox) findViewById(R.id.checkbox_question_3a);
        quest3ChBx2 = (CheckBox) findViewById(R.id.checkbox_question_3b);
        quest3ChBx3 = (CheckBox) findViewById(R.id.checkbox_question_3c);
        quest3ChBx4 = (CheckBox) findViewById(R.id.checkbox_question_3d);

        // Question four answer views
        quest4ChBx1 = (CheckBox) findViewById(R.id.checkbox_question_4a);
        quest4ChBx2 = (CheckBox) findViewById(R.id.checkbox_question_4b);
        quest4ChBx3 = (CheckBox) findViewById(R.id.checkbox_question_4c);
        quest4ChBx4 = (CheckBox) findViewById(R.id.checkbox_question_4d);

        // Question five answer views
        quest5RadioBtn1 = (RadioButton) findViewById(R.id.radio_question_5a);
        quest5RadioBtn2 = (RadioButton) findViewById(R.id.radio_question_5b);
        quest5RadioBtn3 = (RadioButton) findViewById(R.id.radio_question_5c);
        quest5RadioBtn4 = (RadioButton) findViewById(R.id.radio_question_5d);

        // Question six answer view
        questionSix = (EditText) findViewById(R.id.question_six_answer);

        // Question one radio group view
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGrp1);

        // Question two radio group view
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGrp2);

        // Question five radio group view
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGrp3);

        // Identifies the submit button
        button = (Button) findViewById(R.id.submitBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitResult();
                isAnswered = false;
                button.setEnabled(false);
            }
        });

        // Identifies the reset button
        Button button1 = (Button) findViewById(R.id.resetBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performReset();
            }
        });

        // Question 3 CheckBox 1 OnCheckChangeListener
        quest3ChBx1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 3 CheckBox 2 OnCheckChangeListener
        quest3ChBx2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 3 CheckBox 3 OnCheckChangeListener
        quest3ChBx3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 3 CheckBox 4 OnCheckChangeListener
        quest3ChBx4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 4 CheckBox 1 OnCheckChangeListener
        quest4ChBx1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 4 CheckBox 2 OnCheckChangeListener
        quest4ChBx2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 4 CheckBox 3 OnCheckChangeListener
        quest4ChBx3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // Question 4 CheckBox 4 OnCheckChangeListener
        quest4ChBx4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isAnswered = b;
            }
        });

        // RadioGroup one OnCheckChangeListener
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                isAnswered = radioButton.isChecked();
            }
        });

        // RadioGroup two OnCheckChangeListener
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                isAnswered = radioButton.isChecked();
            }
        });

        // RadioGroup three OnCheckChangeListener
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                isAnswered = radioButton.isChecked();
            }
        });
    }

    /**
     * This method is called when the submit button is clicked
     */
    public void submitResult() {
        if (!isAnswered) {
            Toast.makeText(this, "You have not answered any question", Toast.LENGTH_LONG).show();
            return;
        }
        questionSolution1();
        questionSolution2();
        questionSolution3();
        questionSolution4();
        questionSolution5();
        questionSolution6();

        String playerName = userName.getText().toString();

        String submitMessage = getString(R.string.hello) + " " + playerName;
        submitMessage += "\n" + getString(R.string.your_score) + " " + score + " " + getString(R.string.of) +
                "\n" + getString(R.string.correct_answer_in_green) + "\n" +
                getString(R.string.wrong_answer_in_red) + "\n" + getString(R.string.click_the_reset);

        Toast.makeText(this, submitMessage, Toast.LENGTH_LONG).show();
    }

    /**
     * This method reset the quiz
     */
    private void performReset() {
        score = 0;
        quest1RadioBtn1.setTextColor(Color.BLACK);
        quest1RadioBtn1.setChecked(false);
        quest1RadioBtn2.setTextColor(Color.BLACK);
        quest1RadioBtn2.setChecked(false);
        quest1RadioBtn3.setTextColor(Color.BLACK);
        quest1RadioBtn3.setChecked(false);
        quest1RadioBtn4.setTextColor(Color.BLACK);
        quest1RadioBtn4.setChecked(false);
        quest2RadioBtn1.setTextColor(Color.BLACK);
        quest2RadioBtn1.setChecked(false);
        quest2RadioBtn2.setTextColor(Color.BLACK);
        quest2RadioBtn2.setChecked(false);
        quest2RadioBtn3.setTextColor(Color.BLACK);
        quest2RadioBtn3.setChecked(false);
        quest2RadioBtn4.setTextColor(Color.BLACK);
        quest2RadioBtn4.setChecked(false);
        quest3ChBx1.setTextColor(Color.BLACK);
        quest3ChBx1.setChecked(false);
        quest3ChBx2.setTextColor(Color.BLACK);
        quest3ChBx2.setChecked(false);
        quest3ChBx3.setTextColor(Color.BLACK);
        quest3ChBx3.setChecked(false);
        quest3ChBx4.setTextColor(Color.BLACK);
        quest3ChBx4.setChecked(false);
        quest4ChBx1.setTextColor(Color.BLACK);
        quest4ChBx1.setChecked(false);
        quest4ChBx2.setTextColor(Color.BLACK);
        quest4ChBx2.setChecked(false);
        quest4ChBx3.setTextColor(Color.BLACK);
        quest4ChBx3.setChecked(false);
        quest4ChBx4.setTextColor(Color.BLACK);
        quest4ChBx4.setChecked(false);
        quest5RadioBtn1.setTextColor(Color.BLACK);
        quest5RadioBtn1.setChecked(false);
        quest5RadioBtn2.setTextColor(Color.BLACK);
        quest5RadioBtn2.setChecked(false);
        quest5RadioBtn3.setTextColor(Color.BLACK);
        quest5RadioBtn3.setChecked(false);
        quest5RadioBtn4.setTextColor(Color.BLACK);
        quest5RadioBtn4.setChecked(false);
        questionSix.setTextColor(Color.BLACK);
        userName.setText("");
        questionSix.setText("");
        button.setEnabled(true);
        Toast.makeText(this, "Try Again", Toast.LENGTH_LONG).show();
    }

    /**
     * Question 1 radio button
     * This method calculate the score whether right or wrong button is checked
     */
    private void questionSolution1() {
        // Choose from these options

        boolean checkedQuestion1A = quest1RadioBtn1.isChecked();

        boolean checkedQuestion1B = quest1RadioBtn2.isChecked();

        boolean checkedQuestion1C = quest1RadioBtn3.isChecked();

        boolean checkedQuestion1D = quest1RadioBtn4.isChecked();

        // Add 1 if user choose right answer
        if (checkedQuestion1D) {
            score += 1;
            quest1RadioBtn4.setTextColor(Color.GREEN);
        } else if (checkedQuestion1A) {
            quest1RadioBtn1.setTextColor(Color.RED);
        } else if (checkedQuestion1B) {
            quest1RadioBtn2.setTextColor(Color.RED);
        } else if (checkedQuestion1C){
            quest1RadioBtn3.setTextColor(Color.RED);
        } else {
            quest1RadioBtn1.setTextColor(Color.BLACK);
            quest1RadioBtn2.setTextColor(Color.BLACK);
            quest1RadioBtn3.setTextColor(Color.BLACK);
            quest1RadioBtn4.setTextColor(Color.BLACK);
        }
    }

    /**
     * Question 2 radio button
     * This method calculate the score whether right or wrong button is checked
     */
    private void questionSolution2() {
        // Choose from these options

        boolean checkedQuestion2A = quest2RadioBtn1.isChecked();

        boolean checkedQuestion2B = quest2RadioBtn2.isChecked();

        boolean checkedQuestion2C = quest2RadioBtn3.isChecked();

        boolean checkedQuestion2D = quest2RadioBtn4.isChecked();

        // Add 1 if user choose right answer
        if (checkedQuestion2C) {
            score += 1;
            quest2RadioBtn3.setTextColor(Color.GREEN);
        } else if (checkedQuestion2A) {
            quest2RadioBtn1.setTextColor(Color.RED);
        } else if (checkedQuestion2B) {
            quest2RadioBtn2.setTextColor(Color.RED);
        } else if (checkedQuestion2D) {
            quest2RadioBtn4.setTextColor(Color.RED);
        } else {
            quest2RadioBtn1.setTextColor(Color.BLACK);
            quest2RadioBtn2.setTextColor(Color.BLACK);
            quest2RadioBtn3.setTextColor(Color.BLACK);
            quest2RadioBtn4.setTextColor(Color.BLACK);
        }
    }

    /**
     * Question 3 CheckBox
     * This method calculate the score whether right or wrong boxes are checked
     */
    private void questionSolution3() {
        // Choose from these options

        boolean checkedQuestion3A = quest3ChBx1.isChecked();

        boolean checkedQuestion3B = quest3ChBx2.isChecked();

        boolean checkedQuestion3C = quest3ChBx3.isChecked();

        boolean checkedQuestion3D = quest3ChBx4.isChecked();

        // Add 0 if user choose all options and display color red
        if (checkedQuestion3A && checkedQuestion3B && checkedQuestion3C && checkedQuestion3D) {
            quest3ChBx1.setTextColor(Color.RED);
            quest3ChBx2.setTextColor(Color.RED);
            quest3ChBx3.setTextColor(Color.RED);
            quest3ChBx4.setTextColor(Color.RED);
            return;
        }

        // Add 1 if user choose right answer
        if (checkedQuestion3A && checkedQuestion3D) {
            score += 1;
            quest3ChBx1.setTextColor(Color.GREEN);
            quest3ChBx4.setTextColor(Color.GREEN);
        } else if (checkedQuestion3A && checkedQuestion3B) {
            quest3ChBx1.setTextColor(Color.RED);
            quest3ChBx2.setTextColor(Color.RED);
        } else if (checkedQuestion3A && checkedQuestion3C) {
            quest3ChBx1.setTextColor(Color.RED);
            quest3ChBx3.setTextColor(Color.RED);
        } else if (checkedQuestion3B && checkedQuestion3C) {
            quest3ChBx2.setTextColor(Color.RED);
            quest3ChBx3.setTextColor(Color.RED);
        } else if (checkedQuestion3B && checkedQuestion3D) {
            quest3ChBx2.setTextColor(Color.RED);
            quest3ChBx4.setTextColor(Color.RED);
        } else if (checkedQuestion3C && checkedQuestion3D){
            quest3ChBx3.setTextColor(Color.RED);
            quest3ChBx4.setTextColor(Color.RED);
        } else if (checkedQuestion3A) {
            quest3ChBx1.setTextColor(Color.RED);
        } else if (checkedQuestion3B) {
            quest3ChBx2.setTextColor(Color.RED);
        } else if (checkedQuestion3C) {
            quest3ChBx3.setTextColor(Color.RED);
        } else if (checkedQuestion3D) {
            quest3ChBx4.setTextColor(Color.RED);
        } else {
            quest3ChBx1.setTextColor(Color.BLACK);
            quest3ChBx2.setTextColor(Color.BLACK);
            quest3ChBx3.setTextColor(Color.BLACK);
            quest3ChBx4.setTextColor(Color.BLACK);
        }
    }

    /**
     * Question 4 CheckBox
     * This method calculate the score whether right or wrong boxes are checked
     */
    private void questionSolution4() {
        // Choose from these options

        boolean checkedQuestion4A = quest4ChBx1.isChecked();

        boolean checkedQuestion4B = quest4ChBx2.isChecked();

        boolean checkedQuestion4C = quest4ChBx3.isChecked();

        boolean checkedQuestion4D = quest4ChBx4.isChecked();

        // Add 0 if user choose all options and display color red
        if (checkedQuestion4A && checkedQuestion4B && checkedQuestion4C && checkedQuestion4D) {
            quest4ChBx1.setTextColor(Color.RED);
            quest4ChBx2.setTextColor(Color.RED);
            quest4ChBx3.setTextColor(Color.RED);
            quest4ChBx4.setTextColor(Color.RED);
            return;
        }

        // Add 1 if user choose right answer
        if (checkedQuestion4C && checkedQuestion4D) {
            score += 1;
            quest4ChBx3.setTextColor(Color.GREEN);
            quest4ChBx4.setTextColor(Color.GREEN);
        } else if (checkedQuestion4A && checkedQuestion4B) {
            quest4ChBx1.setTextColor(Color.RED);
            quest4ChBx2.setTextColor(Color.RED);
        } else if (checkedQuestion4A && checkedQuestion4C) {
            quest4ChBx1.setTextColor(Color.RED);
            quest4ChBx3.setTextColor(Color.RED);
        } else if (checkedQuestion4A && checkedQuestion4D) {
            quest4ChBx1.setTextColor(Color.RED);
            quest4ChBx4.setTextColor(Color.RED);
        } else if (checkedQuestion4B && checkedQuestion4C) {
            quest4ChBx2.setTextColor(Color.RED);
            quest4ChBx3.setTextColor(Color.RED);
        } else if (checkedQuestion4B && checkedQuestion4D) {
            quest4ChBx2.setTextColor(Color.RED);
            quest4ChBx4.setTextColor(Color.RED);
        } else if (checkedQuestion4A) {
            quest4ChBx1.setTextColor(Color.RED);
        } else if (checkedQuestion4B) {
            quest4ChBx2.setTextColor(Color.RED);
        } else if (checkedQuestion4C) {
            quest4ChBx3.setTextColor(Color.RED);
        } else if (checkedQuestion4D) {
            quest4ChBx4.setTextColor(Color.RED);
        } else {
            quest4ChBx1.setTextColor(Color.BLACK);
            quest4ChBx2.setTextColor(Color.BLACK);
            quest4ChBx3.setTextColor(Color.BLACK);
            quest4ChBx4.setTextColor(Color.BLACK);
        }
    }

    /**
     * Question 5 radio button
     * This method calculate the score whether right or wrong button is checked
     */
    private void questionSolution5() {
        // Choose from these options

        boolean checkedQuestion5A = quest5RadioBtn1.isChecked();

        boolean checkedQuestion5B = quest5RadioBtn2.isChecked();

        boolean checkedQuestion5C = quest5RadioBtn3.isChecked();

        boolean checkedQuestion5D = quest5RadioBtn4.isChecked();

        // Add 1 if user choose right answer
        if (checkedQuestion5C) {
            score += 1;
            quest5RadioBtn3.setTextColor(Color.GREEN);
        } else if (checkedQuestion5A) {
            quest5RadioBtn1.setTextColor(Color.RED);
        } else if (checkedQuestion5B) {
            quest5RadioBtn2.setTextColor(Color.RED);
        } else if (checkedQuestion5D) {
            quest5RadioBtn4.setTextColor(Color.RED);
        } else {
            quest5RadioBtn1.setTextColor(Color.BLACK);
            quest5RadioBtn2.setTextColor(Color.BLACK);
            quest5RadioBtn3.setTextColor(Color.BLACK);
            quest5RadioBtn4.setTextColor(Color.BLACK);
        }
    }

    /**
     * Question 6
     * This method takes in the user input and add 1 to the score if the correct answer has been entered
     */
    private void questionSolution6() {

        String quest6Answer = questionSix.getText().toString();
        if (quest6Answer.equals("Cristiano Ronaldo")) {
            score += 1;
            questionSix.setTextColor(Color.GREEN);
        } else {
            questionSix.setTextColor(Color.RED);
        }
    }
}