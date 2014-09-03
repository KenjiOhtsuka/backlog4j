package com.nulabinc.backlog4j;

/**
 * The interface for Backlog changeLog data.
 *
 * @author nulab-inc
 */
public interface ChangeLog {
    String getField();

    String getNewValue();

    String getOldValue();

    AttachmentInfo getAttachmentInfo();

    String getAttributeInfo();

    String getNotificationInfo();


}
