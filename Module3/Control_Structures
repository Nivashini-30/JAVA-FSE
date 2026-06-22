TABLE CREATION

CREATE TABLE Customers (
CustomerID NUMBER PRIMARY KEY,
CustomerName VARCHAR2(50),
Age NUMBER,
Balance NUMBER,
IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
LoanID NUMBER PRIMARY KEY,
CustomerID NUMBER,
InterestRate NUMBER,
DueDate DATE
);

INSERT SAMPLE DATA

INSERT INTO Customers VALUES
(1,'John',65,15000,'FALSE');

INSERT INTO Customers VALUES
(2,'Mary',45,8000,'FALSE');

INSERT INTO Customers VALUES
(3,'David',70,20000,'FALSE');

INSERT INTO Customers VALUES
(4,'Sarah',55,12000,'FALSE');
INSERT INTO Loans VALUES
(101,1,8,SYSDATE+20);

INSERT INTO Loans VALUES
(102,2,10,SYSDATE+40);

INSERT INTO Loans VALUES
(103,3,7,SYSDATE+10);

INSERT INTO Loans VALUES
(104,4,9,SYSDATE+25);

COMMIT;

SCENARIO 1
Apply 1% Discount for Customers Above 60

SET SERVEROUTPUT ON;

BEGIN
FOR cust IN (
SELECT CustomerID, Age
FROM Customers
)
LOOP
IF cust.Age > 60 THEN

        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Discount applied for Customer ID: '
            || cust.CustomerID
 );

    END IF;
END LOOP;

COMMIT;

END;
/

VERIFY
SELECT * FROM Loans;

SCENARIO 2
Promote Customers to VIP

BEGIN
FOR cust IN (
SELECT CustomerID, Balance
FROM Customers
)
LOOP
IF cust.Balance > 10000 THEN

        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE(
            'Customer '
            || cust.CustomerID
            || ' promoted to VIP.'
        );

    END IF;
END LOOP;

COMMIT;

END;
/

VERIFY
SELECT * FROM Customers;

SCENARIO 3
Loan Due Reminder

BEGIN
FOR loan_rec IN (
SELECT LoanID,
CustomerID,
DueDate
FROM Loans
WHERE DueDate BETWEEN SYSDATE
AND SYSDATE + 30
)
LOOP

    DBMS_OUTPUT.PUT_LINE(
        'Reminder: Loan ID '
        || loan_rec.LoanID
        || ' for Customer ID '
        || loan_rec.CustomerID
        || ' is due on '
        || TO_CHAR(
            loan_rec.DueDate,
            'DD-MON-YYYY'
        )
);

END LOOP;

END;
/

VERIFY
SELECT * FROM Loans;
