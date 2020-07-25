package in.bushansirgur.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bushansirgur.expensetracker.model.Expense;
import in.bushansirgur.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseSerivceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}

	@Override
	public Expense save(Expense expense) {
		expenseRepository.save(expense);
		return expense;
	}

	@Override
	public Expense findById(Long id) {
		if(expenseRepository.findById(id).isPresent()){
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		Expense expense = findById(id);
		expenseRepository.delete(expense);
	}

}
