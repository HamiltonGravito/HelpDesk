package com.github.hamilton.helpdesk.domain.enums;

public enum Perfil {

	ADMINISTRADOR(0, "HOLE_ADMIN"), CLIENTE(1, "HOLE_CLIENT"), TECNICO(2, "HOLE_TECNICO");

	private int codigo;
	private String descricao;

	private Perfil(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Perfil toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (Perfil x : Perfil.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Perfil Inválido!");
	}

}
