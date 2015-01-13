package com.vijaya.patterns.builder;

public class Vehicle {
	
	private String body;
	private String engine;
	private String fuelTank;
	private String seat;
	private String guard;
	
	public static class Builder{

		private String body;
		private String engine;
		private String fuelTank;
		private String seat;
		private String guard;
		
		
		public Builder setBody(String body){ this.body = body; return this;  }
		public Builder setEngine(String engine){ this.engine = engine; return this;  }
		public Builder setFuelTank(String tank){ this.fuelTank = tank; return this;  }
		public Builder setSeat(String seat){ this.body = seat; return this;  }
		public Builder setGuard(String guard){ this.body = guard; return this;  }
		
		
		public Vehicle build(){
			return new Vehicle(this);
		}
		
		
	}

	public Vehicle(Builder builder) {
		
		this.body = builder.body;
		this.engine = builder.engine;
		this.fuelTank = builder.fuelTank;
		this.guard = builder.guard;
		this.seat = builder.seat;
	}
	
	public String getBody(){
		return this.body;
	}

}
