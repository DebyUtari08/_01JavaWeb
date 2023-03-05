package com.juaracoding;

import com.juaracoding._01JavaWeb.core.BcryptImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println(BcryptImpl.verifyHash("Paul@123","$2a$11$fBN/jwMs0w8ba3GHUuPvtObVsYF7yUDQn4Km9eHFITeYDja9ZySSa"));
    }
}