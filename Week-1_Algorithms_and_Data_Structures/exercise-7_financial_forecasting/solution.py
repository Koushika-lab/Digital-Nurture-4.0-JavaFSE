def forecast_recursive(value, rate, years):
    if years == 0:
        return value
    return forecast_recursive(value * (1 + rate), rate, years - 1)


def forecast_iterative(value, rate, years):
    
    for _ in range(years):
        value *= (1 + rate)
    return value


def forecast_exponential(value, rate, years):
    return value * pow(1 + rate, years)


# ---------- Test with an example ----------
if __name__ == "__main__":
    initial_value = 1000  # ₹1000 initial investment
    growth_rate = 0.05    # 5% annual growth
    years = 5

    print("Financial Forecasting Tool")
    print("--------------------------")
    print(f"Initial Value: ₹{initial_value}")
    print(f"Growth Rate: {growth_rate * 100}%")
    print(f"Years: {years}\n")

    print("Using Recursive Forecast: ₹{:.2f}".format(forecast_recursive(initial_value, growth_rate, years)))
    print("Using Iterative Forecast: ₹{:.2f}".format(forecast_iterative(initial_value, growth_rate, years)))
    print("Using Exponential Forecast: ₹{:.2f}".format(forecast_exponential(initial_value, growth_rate, years)))
