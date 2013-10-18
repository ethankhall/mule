package io.ehdev.mule;

import org.joda.time.DateTime;

public class JobRequest {
    String message;
    DateTime timeStartedAt;

    public JobRequest(String message) {
        this.message = message;
        timeStartedAt = DateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DateTime getTimeStartedAt() {
        return timeStartedAt;
    }

    public void setTimeStartedAt(DateTime timeStartedAt) {
        this.timeStartedAt = timeStartedAt;
    }
}
