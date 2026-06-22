TABLE CREATION

CREATE TABLE Accounts (
AccountID NUMBER PRIMARY KEY,
AccountType VARCHAR2(20),
Balance NUMBER
);

CREATE TABLE Employees (
EmployeeID NUMBER PRIMARY KEY,
EmployeeName VARCHAR2(50),
DepartmentID NUMBER,
Salary NUMBER
);

SAMPLE DATA

INSERT INTO Accounts VALUES
(1001,'SAVINGS',10000);

INSERT INTO Accounts VALUES
(1002,'SAVINGS',15000);

INSERT INTO Accounts VALUES
(1003,'CURRENT',20000);

INSERT INTO Employees VALUES
(1,'John',101,50000);

INSERT INTO Employees VALUES
(2,'Mary',101,60000);

INSERT INTO Employees VALUES
(3,'David',102,55000);
COMMIT;

SCENARIO 1
Process Monthly Interest

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
UPDATE Accounts
SET Balance = Balance + (Balance * 0.01)
WHERE AccountType = 'SAVINGS';
COMMIT;
END;
/

BEGIN
ProcessMonthlyInterest;
END;
/

VERIFY
SELECT * FROM Accounts;

SCENARIO 2
Employee Bonus

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
p_DepartmentID NUMBER,
p_BonusPercent NUMBER
)
IS
BEGIN
UPDATE Employees
SET Salary = Salary + (Salary * p_BonusPercent / 100)
WHERE DepartmentID = p_DepartmentID;
COMMIT;
END;
/
BEGIN
UpdateEmployeeBonus(101,10);
END;
/

VERIFY
SELECT * FROM Employees;

SCENARIO 3
Transfer Funds

CREATE OR REPLACE PROCEDURE TransferFunds
(
p_FromAccount NUMBER,
p_ToAccount NUMBER,
p_Amount NUMBER
)
IS
v_Balance NUMBER;
BEGIN
SELECT Balance
INTO v_Balance
FROM Accounts
WHERE AccountID = p_FromAccount;
IF v_Balance >= p_Amount THEN
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccount;
COMMIT;
    DBMS_OUTPUT.PUT_LINE(
        'Funds transferred successfully.'
    );
ELSE
    DBMS_OUTPUT.PUT_LINE(
        'Insufficient balance.'
    );
END IF;
END;
/
BEGIN
TransferFunds(1001,1002,500);
END;
/

VERIFY
SELECT * FROM Accounts;
