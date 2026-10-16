# JPA Inserts with Relationships

Loads existing political parties and saves new candidates linked to those parties.

## Responsibilities

1. **Application and Startup Task (`JpaInsertWithRelationApp`):** looks up the parties, creates the candidates, and saves them after Spring startup.
2. **Child Entity (`Candidate`):** maps candidates and owns the `party_id` relationship.
3. **Referenced Entity (`PoliticalParty`):** maps political parties that can be shared by multiple candidates.
4. **Repositories (`CandidateRepository`, `PoliticalPartyRepository`):** provide candidate persistence and party lookup.

## Learning Notes

- `@ManyToOne` means multiple candidates can reference the same party. `@JoinColumn(name = "party_id")` names the foreign-key column on `candidates`.
- The app loads party IDs `2` and `1`; both must exist before the candidate constructors are called.
- `findById()` returns Optional; `orElseThrow()` stops execution when a required party is missing.
- Passing the party object to `new Candidate(name, party)` connects the entities before saving.
- The relationship declares no cascade. This flow looks up existing parties instead of creating them when candidates are saved.
- Both entities use generated IDs. Running the startup task creates new candidate rows.

## Concept Flow

```mermaid
flowchart LR
    ExistingParent["Load Existing Parent"] --> NewChild["Create Child with Parent Reference"] --> Save["Save Child"]
```

## Implementation Flow

```mermaid
flowchart LR
    JpaInsertWithRelationApp --> PoliticalPartyRepository --> PoliticalParty
    PoliticalParty --> Candidate
    Candidate --> CandidateRepository --> Candidates["candidates Table"]
```
