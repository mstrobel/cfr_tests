package org.benf.cfr.tests;

record RecordTest7 (String firstName, String lastName, RecordTest2 child) {
    public RecordTest7 {
        firstName = "fred";
        if (firstName.equals("bob")) {
            lastName = null;
        }
        }

}
