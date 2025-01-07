// services/tripPlannerService.js
import axios from 'axios';

const API_BASE_URL = process.env.REACT_APP_API_BASE_URL || 'http://localhost:8080';

export const getTripLayout = async (fromStation, toStation) => {
    try {
        const response = await axios.get(`${API_BASE_URL}/api/trip-planner`, {
            params: { from: fromStation, to: toStation },
        });
        return response.data;
    } catch (error) {
        console.error("Error fetching trip layout:", error);
        throw error;
    }
};