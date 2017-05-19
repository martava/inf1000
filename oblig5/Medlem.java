class Medlem{
  final int medlemsnummer;
  private String namn;
  private String adresse;
  private String tlfnr;
  private String epost;
  private boolean betalt = false;

  public Medlem(String n, String a, String t, String e, int nr){
    //Tar i mot all info om eit medlem og lagrar det i variablane
    namn = n;
    adresse = a;
    tlfnr = t;
    epost = e;
    medlemsnummer = nr;
  }
  public void betaler(){
    //registerer at ein person har betalt
    betalt = true;
  }
  public void endreNamn(String na){
    //metode for aa endre namn til det sm er blitt sendt inn som aprameter
    namn = na;
  }
  public void endreAdresse(String adr){
    //metode for aa endre adresse
    adresse = adr;
  }
  public void endreTlfnr(String nr){
    //metode for aa endre tlfnr
    tlfnr = nr;
  }
  public void endreEpost(String ep){
    //metode for aa endre epost
    epost = ep;
  }
  public String hentNamn(){
    //metode for aa skrive ut namnet
    return namn;
  }
  public String hentAdresse(){
    //metode for aa skrive ut adresa
    return adresse;
  }
  public String hentTlfnr(){
    //metode for aa skrive ut tlfnr
    return tlfnr;
  }
  public String hentEpost(){
    //metode for aa skrive ut epostadressa
    return epost;
  }
  public void harBetalt(){ //metode som skriv ut om medlemmet har betalt eller ei
    if(betalt){
      System.out.println(namn + " har betalt medlemsskapet sitt");
  }
  else{
    System.out.println(namn + " har ikkje betalt medlemsskapet sitt");
    }
  }
  public String hentInformasjon(){ //metode som skriv ut all ifnormasjon om eit medlem
    return "Medlemsnummer:" + medlemsnummer + "\nNamn: " + namn + "\nAdresse: " + adresse + "\nTelefonnummer: " + tlfnr + "\nE-postadresse: " + epost;
  }
}
