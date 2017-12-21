package com.example.lg.androboum;

public class Profil {
    // les différents status d'un utilisateur
    enum BombStatut {
        IDLE, AWAITING, BOMBER, BOMBED
    }

    ;
    // mon email
    private String email;
    // mon statut de connexion (vrai ou faux)
    boolean isConnected;
    // mon identifiant unique
    private String uid;
    // mon statut actuel
    private BombStatut statut = BombStatut.IDLE;
    // l'identifiant de mon adversaire

    public void setEmail(String email) {
        this.email = email;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setStatut(BombStatut statut) {
        this.statut = statut;
    }

    public void setOtherUserUID(String otherUserUID) {
        this.otherUserUID = otherUserUID;
    }

    public void setOtherUseremail(String otherUseremail) {
        this.otherUseremail = otherUseremail;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getEmail() {

        return email;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public String getUid() {
        return uid;
    }

    public BombStatut getStatut() {
        return statut;
    }

    public String getOtherUserUID() {
        return otherUserUID;
    }

    public String getOtherUseremail() {
        return otherUseremail;
    }

    public long getScore() {
        return score;
    }

    private String otherUserUID;
    // l'email de mon adversaire
    private String otherUseremail;
    // mon score
    private long score = 0;

}