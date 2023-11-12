package homework27.task02;

public class BankAccount {
  private double cardBalance;
  private String accountNumber;


  public BankAccount(String accountNumber){
    cardBalance = 0;
    this.accountNumber = accountNumber;
  }

  public String getAccountNumber(){
    return accountNumber;
  }

  public double getCardBalance(){
    return cardBalance;
  }

  public void deductMoney(double cardBalance, double money){
    this.cardBalance = cardBalance;
    if(money > cardBalance){
      System.out.println("Ошибка, недостаточно средств");
      }else{
      this.cardBalance -= money;
      System.out.println("Баланс карты: " + this.cardBalance + " €");
    }
  }

  public void putOnMoney(double cardBalance, double money){
    this.cardBalance = cardBalance;
    this.cardBalance += money;
    System.out.println("Баланс карты: " + this.cardBalance + " €");
    }

  }


