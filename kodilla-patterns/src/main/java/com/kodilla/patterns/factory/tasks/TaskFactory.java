package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("TaskOne", "Tomatos", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("TaskTwo", "Yellow", "The big white wall in the living room" );
            case DRIVING_TASK:
                return new DrivingTask("TaskThree", "Tesco", "Longboard");
            default:
                throw new IllegalArgumentException("Type of task should be SHOPPING_TASK, PAINTING_TASK, DRIVING_TASK");
        }
    }
}
