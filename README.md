# BankRMIServer

Napisz następującą aplikację wykorzystując technologię RMI. Na dwóch maszynach rejestrujemy dwa obiekty: Store i Bank. Klient łączy się ze sklepem i przekazuje zamówienie w formie obiektu Order (zawierającego identyfikator klienta, identyfikator/nazwę towaru i ilość towaru, numer rachunku bankowego klienta, itd.) i otrzymuje rachunek w formie obiektu klasy Bill (zawierającego dodatkowo rachunek bankowy sklepu, itd.). Klient wysyła rachunek do banku do realizacji. Może też zażądać od banku wyciągu, w formie obiektu zawierającego jakąś kolekcję swoich rachunków i jakieś dodatkowe informacje (podsumowanie wydatków, wybraną losowo reklamę. . . ). W sklepie, zarówno ilość towarów jak również ilość/liczba sztuk każdego towaru jest ograniczona. Zaprojektuj prosty interfejs graficzny dla klienta.

Uwaga: Klientów może być wielu i mogą działać jednocześnie - trzeba zatem zapewnić odpowiednią synchronizację.
