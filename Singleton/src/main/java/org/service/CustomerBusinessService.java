package org.service;

public class CustomerBusinessService {
    private int idNumber;
    private Customer customer;

    public Customer getCustomerFromId(int idNumber){
        //Send a request {idNumber} ---->  HTTPClient
        // ----> String ->> CustomerDTO
        String response  = "1:Bob:Ross:9001:42";
        String [] data = response.split(":");
        int id = Integer.parseInt(data[0]);
        String first = data[1];
        String last = data[2];
        int rewards = Integer.parseInt(data[3]);
        int points = Integer.parseInt(data[4]);
        return convertDTOToCustomer(new CustomerDTO(id,first, last, rewards, points));

    }

    public CustomerDTO convertCustomerToDTO(Customer customer){
        return new CustomerDTO(customer.getIdNumber(), customer.getFirstName(), customer.getLastName(), customer.getRewardsNumber(), 0);

    }

    public Customer convertDTOToCustomer(CustomerDTO dto){
        Customer cust = new Customer();
        cust.setFirstName(dto.getFirstName());
        cust.setLastName(dto.getLastName());
        cust.setIdNumber(dto.getIdNumber());
        cust.setRewardsNumber(dto.getRewardsNumber());
        return cust;

    }
}
