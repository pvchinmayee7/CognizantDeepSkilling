# Banking Stored Procedures

This project contains stored procedures for banking operations:

- ProcessMonthlyInterest: applies 1% monthly interest to all savings accounts.
- UpdateEmployeeBonus: adds bonus % to employees' salaries in a given department.
- TransferFunds: transfers funds between two accounts with balance checks.

## Usage

Use SQLcl or SQL*Plus to run the `.sql` files in order:

```bash
@01_ProcessMonthlyInterest.sql
@02_UpdateEmployeeBonus.sql
@03_TransferFunds.sql

---

# How to set up in VS Code

1. Open VS Code and create a new folder named `BankingStoredProcedures`.
2. Inside that folder, create the 4 files above with their respective contents.
3. Use the Oracle SQL extension or SQLcl terminal to connect to your Oracle DB.
4. Run the scripts by executing:

```sql
@01_ProcessMonthlyInterest.sql
@02_UpdateEmployeeBonus.sql
@03_TransferFunds.sql


EXEC ProcessMonthlyInterest;
EXEC UpdateEmployeeBonus(10, 5);
EXEC TransferFunds(101, 102, 500);
