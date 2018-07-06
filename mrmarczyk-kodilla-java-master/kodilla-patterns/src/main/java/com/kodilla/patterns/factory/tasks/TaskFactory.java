package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public enum TaskType {SHOPPING_TASK, PAINTING_TASK, DRIVING_TASK }

    public final Task makeTask(final TaskType taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("TaskOne", "Tomatos", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("TaskTwo", "Yellow", "The big white wall in the living room" );
            //case DRIVING_TASK:
            //    return new DrivingTask("TaskThree", "Tesco", "Longboard");
            default:
                throw new IllegalArgumentException("Unsupported task type: " + taskClass);
        }
    }
}
