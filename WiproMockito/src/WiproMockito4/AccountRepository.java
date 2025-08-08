// File: mockito4/AccountRepository.java
package WiproMockito4;

public interface AccountRepository {
    Account findById(String id);
    void update(Account account);
}