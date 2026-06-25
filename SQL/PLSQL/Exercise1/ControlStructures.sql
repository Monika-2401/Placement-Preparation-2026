SET SERVEROUTPUT ON;
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE
);

INSERT INTO Customers
VALUES (
    1,
    'John Doe',
    TO_DATE('1955-05-15','YYYY-MM-DD'),
    12000,
    SYSDATE
);

INSERT INTO Customers
VALUES (
    2,
    'Jane Smith',
    TO_DATE('1990-07-20','YYYY-MM-DD'),
    8000,
    SYSDATE
);

INSERT INTO Loans
VALUES (
    1,
    1,
    5000,
    10,
    SYSDATE-100,
    SYSDATE+20
);

INSERT INTO Loans
VALUES (
    2,
    2,
    6000,
    8,
    SYSDATE-50,
    SYSDATE+40
);

COMMIT;

BEGIN
    FOR cust IN (
        SELECT CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
        FROM Customers
    )
    LOOP

        IF cust.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest Discount Applied for Customer '
                || cust.CustomerID
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/

SELECT * FROM Loans;

BEGIN
    FOR cust IN (
        SELECT CustomerID,
               Balance
        FROM Customers
    )
    LOOP

        IF cust.Balance > 10000 THEN

            DBMS_OUTPUT.PUT_LINE(
                'VIP Customer: '
                || cust.CustomerID
            );

        END IF;

    END LOOP;
END;
/
BEGIN
    FOR loan_rec IN (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN
              SYSDATE AND SYSDATE+30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || loan_rec.LoanID
            || ' for Customer '
            || loan_rec.CustomerID
            || ' is due on '
            || TO_CHAR(
                loan_rec.EndDate,
                'DD-MON-YYYY'
            )
        );

    END LOOP;
END;
/