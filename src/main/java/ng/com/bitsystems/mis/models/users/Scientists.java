package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.Specializations;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.models.laboratories.Results;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.ClearedQueue;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Scientists extends Users {
    @ManyToMany
    private Set<Specializations> specializations = new HashSet<>();

    @OneToOne
    private AccountHolder accountHolder;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<ClearedQueue> clearedQueues = new HashSet<>();


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<DonationQueue> donationQueues = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<IssuanceLogs> issuanceLogs = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<CollectedSamples> collectedSamples = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<Results> results = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<VerifiedResults> verifiedResults = new HashSet<>();

    public Scientists addClearedQueue(ClearedQueue clearedQueue) {
        this.clearedQueues.add(clearedQueue);
        clearedQueue.setUsers(this);
        return this;
    }

    public Scientists addDonationQueue(DonationQueue donationQueue) {
        this.donationQueues.add(donationQueue);
        donationQueue.setUsers(this);
        return this;
    }

    public Scientists addIssuedLog(IssuanceLogs issuanceLogs) {
        this.issuanceLogs.add(issuanceLogs);
        issuanceLogs.setUsers(this);
        return this;
    }

    public Scientists addCollectedSample(CollectedSamples collectedSamples) {
        this.collectedSamples.add(collectedSamples);
        collectedSamples.setUsers(this);
        return this;
    }

    public Scientists addCreatedResults(Results results) {
        this.results.add(results);
        results.setUsers(this);
        return this;
    }

    public Scientists addVerifiedResult(VerifiedResults verifiedResults) {
        this.verifiedResults.add(verifiedResults);
        verifiedResults.setUsers(this);
        return this;
    }
}
