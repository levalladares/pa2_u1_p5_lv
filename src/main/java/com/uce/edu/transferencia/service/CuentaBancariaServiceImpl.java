package com.uce.edu.transferencia.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionar(numero);
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		this.bancariaRepository.insertar(cuentaBancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.bancariaRepository.actualizar(cuentaBancaria);
		
	}

	@Override
	public void eliminar(String numero) {
		this.bancariaRepository.eliminar(numero);
		
	}

	@Override
	public CuentaBancaria depositar(String numero, BigDecimal valorDeposito) {
		// TODO Auto-generated method stub
		CuentaBancaria cta = this.bancariaRepository.seleccionar(numero);
		BigDecimal impuestoBanco= valorDeposito.multiply(new BigDecimal(0.10));
		BigDecimal valorDepositoImp=valorDeposito.subtract(impuestoBanco);
		BigDecimal valorCuenta=cta.getSaldo().add(valorDepositoImp);
		valorCuenta = valorCuenta.setScale(2, RoundingMode.DOWN);
		cta.setSaldo(valorCuenta);
		this.bancariaRepository.actualizar(cta);
		return cta;
	}

}
