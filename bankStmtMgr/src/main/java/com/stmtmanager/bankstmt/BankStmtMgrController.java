package com.stmtmanager.bankstmt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class BankStmtMgrController {
 
    @GetMapping("/showstatement")
    public String getStatement() {
        return "Shwoing Statement!";
    }
}