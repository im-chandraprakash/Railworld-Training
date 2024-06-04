package Models;

import java.time.LocalDate;

public class Transaction {

    private int TransactionId;
    private int BookId;
    private int StudentId;
    private LocalDate IssueDate;
    private LocalDate DueDate;
    private LocalDate ReturnDate;
    private double FineAmount;
    private String ReservationStatus;

    public int getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(int transactionId) {
        TransactionId = transactionId;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public LocalDate getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        IssueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return DueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        DueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        ReturnDate = returnDate;
    }

    public double getFineAmount() {
        return FineAmount;
    }

    public void setFineAmount(double fineAmount) {
        FineAmount = fineAmount;
    }

    public String getReservationStatus() {
        return ReservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        ReservationStatus = reservationStatus;
    }
}
