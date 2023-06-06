package com.example.newquizbee.model;

import java.util.ArrayList;

public class Questions {
    private Integer number;

    private String question;

    @SerializedName("answers")
    private ArrayList<String> answers;

    @SerializedName("correct_answer")
    private Integer correctAnswer;
}
