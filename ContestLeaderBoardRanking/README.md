# Contest Leaderboard Ranking

## Problem Statement

An online judge evaluates submissions and ranks participants at the end of a contest.

Each participant is represented by a `Participant` object containing the following attributes:

- `username` – Unique username of the participant.
- `problemsSolved` – Total number of problems successfully solved.
- `penaltyTime` – Total penalty time accumulated in minutes.
- `rating` – Current competitive programming rating.

The objective is to sort all participants according to the official contest ranking rules.

## Ranking Criteria

Participants are ranked using the following tie-breaking rules:

1. **Problems Solved:** Higher number of problems solved ranks first (Descending Order).
2. **Penalty Time:** Lower penalty time ranks first (Ascending Order).
3. **Current Rating:** Higher rating ranks first (Descending Order).
4. **Username:** Alphabetical order of username (Ascending Order, Case-Sensitive).

## Input Format

- First line contains an integer `N`, representing the number of participants.
- Each of the next `N` lines contains:
  - Username
  - Problems Solved
  - Penalty Time
  - Rating

## Output Format

Print `N` lines representing the final leaderboard from Rank 1 to Rank N.

Each line contains:

`username problemsSolved penaltyTime rating`

## Constraints

- 1 ≤ N ≤ 10⁵
- 1 ≤ |username| ≤ 20
- 0 ≤ problemsSolved ≤ 20
- 0 ≤ penaltyTime ≤ 10⁶
- 0 ≤ rating ≤ 4000
- All usernames are unique.

## Test Case 1

### Input

```text
5
alice 5 120 1850
bob 6 210 1700
charlie 5 120 1920
dave 5 150 2000
eve 5 120 1920
```

### Expected Output

```text
bob 6 210 1700
charlie 5 120 1920
eve 5 120 1920
alice 5 120 1850
dave 5 150 2000
```

## Concepts Used

- Java Classes and Objects
- ArrayList / Collections
- Comparator Interface
- Custom Sorting
- Lambda Expressions (if used)
- Multi-level Sorting
- Lexicographical String Comparison

## Approach

1. Create a `Participant` class with username, problemsSolved, penaltyTime, and rating attributes.
2. Read the participant details from input.
3. Store all participant objects in a collection.
4. Implement a custom comparator to apply the four ranking criteria.
5. Sort the participants using `Collections.sort()` or `List.sort()`.
6. Display the final leaderboard.


## Project Files

- `Main.java` – Main program containing input handling and leaderboard sorting logic.
- `Participant.java` – Participant class containing participant details.


